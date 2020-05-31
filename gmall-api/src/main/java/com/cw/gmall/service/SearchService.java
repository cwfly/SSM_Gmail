package com.cw.gmall.service;

import com.cw.gmall.bean.PmsSearchParam;
import com.cw.gmall.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {

    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);

}
