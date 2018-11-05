package com.example.kson.moduledemo.presenter;

import com.blankj.utilcode.util.ToastUtils;
import com.example.kson.lib_net.network.PresenterCallback;
import com.example.kson.moduledemo.contract.LoginContract;
import com.example.kson.moduledemo.entity.News;
import com.example.kson.moduledemo.entity.UserEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/11/01
 * Description:
 */
public class LoginPresenter extends LoginContract.LoginPresenter{

    @Override
    public void login(HashMap<String, Object> params) {
        mModel.login(params, new PresenterCallback<UserEntity>() {

            @Override
            public void onSuccess(UserEntity news) {
                ToastUtils.showLong(news.mobile+"");
            }

            @Override
            public void onSuccessMsg(String status, String message) {

            }

            @Override
            public void onErrorMsg(int code, String msg) {

            }
        });
    }

//    @Override
//    protected void accepts(Object list, Object o) {
//        if (o instanceof News){
//
//            List<News> list1 = (List<News>) list;
//            System.out.println("list1.size"+((List<News>) list).size());
//
//        }
//
//    }
}
