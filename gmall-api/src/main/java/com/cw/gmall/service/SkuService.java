package com.cw.gmall.service;

import com.cw.gmall.bean.PmsProductSaleAttr;
import com.cw.gmall.bean.PmsSkuInfo;

import java.math.BigDecimal;
import java.util.List;

public interface SkuService {


    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(Long productId);

    List<PmsSkuInfo> getAllSku();

    boolean checkPrice(Long productSkuId, BigDecimal price);
}
