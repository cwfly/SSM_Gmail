package com.cw.gmall.service;

import com.cw.gmall.bean.PmsBaseSaleAttr;
import com.cw.gmall.bean.PmsProductImage;
import com.cw.gmall.bean.PmsProductInfo;
import com.cw.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> getSpuList(String catalog3Id);

    List<PmsBaseSaleAttr> getSpuProductSaleAttr();

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> getSpuSaleAttrList(String spuId);

    List<PmsProductImage> getSpuImageList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(Long productId, Long id);
}
