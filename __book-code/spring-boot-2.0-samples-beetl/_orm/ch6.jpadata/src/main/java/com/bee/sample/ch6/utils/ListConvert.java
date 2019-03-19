package com.bee.sample.ch6.utils;

import java.util.List;

public class ListConvert {

    public static String listToString(List<String> mList) {
        String convertedListStr = "";
        if (null != mList && mList.size() > 0) {
            String[] mListArray = mList.toArray(new String[mList.size()]);
            for (int i = 0; i < mListArray.length; i++) {
                if (i < mListArray.length - 1) {
                    convertedListStr += mListArray[i] + ",";
                } else {
                    convertedListStr += mListArray[i];
                }
            }
            return convertedListStr;
        } else return "List is null!!!";
    }
}
