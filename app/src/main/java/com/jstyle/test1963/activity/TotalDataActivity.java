package com.jstyle.test1963.activity;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.jstyle.blesdk1963.Util.BleSDK;
import com.jstyle.blesdk1963.constant.BleConst;
import com.jstyle.blesdk1963.constant.DeviceKey;
import com.jstyle.test1963.R;
import com.jstyle.test1963.adapter.TotalDataAdapter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TotalDataActivity extends BaseActivity {


    @BindView(R.id.bt_readData)
    Button btReadData;
    @BindView(R.id.bt_DeleteData)
    Button btDeleteData;
    @BindView(R.id.RecyclerView_totalData)
    RecyclerView RecyclerViewDetailData;
    private TotalDataAdapter toatlDataAdapter;
    int ModeStart=0;
    int ModeContinue=2;
    int ModeDelete=0x99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_data);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerViewDetailData.setLayoutManager(linearLayoutManager);
        toatlDataAdapter = new TotalDataAdapter();
        RecyclerViewDetailData.setAdapter(toatlDataAdapter);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        RecyclerViewDetailData.addItemDecoration(dividerItemDecoration);
    }

    @OnClick({R.id.bt_readData, R.id.bt_DeleteData})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_readData:
                dataCount=0;
                list.clear();
               getTotalData(ModeStart);
                break;
            case R.id.bt_DeleteData:
                getTotalData(ModeDelete);
                break;
        }
    }
    List<Map<String,String>>list=new ArrayList<>();
    int dataCount=0;
    @Override
    public void dataCallback(Map<String, Object> maps) {
        super.dataCallback(maps);
        String dataType= getDataType(maps);
        boolean finish=getEnd(maps);
        switch (dataType){
            case BleConst.GetTotalActivityData:
                dataCount++;
                list.addAll((List<Map<String,String>>)maps.get(DeviceKey.Data));
                if(finish){
                    toatlDataAdapter.setData(list);
                }
                if(dataCount==50){
                   dataCount=0;
                    if(finish){
                        toatlDataAdapter.setData(list);
                    }else{
                        getTotalData(ModeContinue);
                    }
                }

                break;

        }

    }
    private void getTotalData(int mode){
        sendValue(BleSDK.GetTotalActivityDataWithMode(mode));
    }
}
