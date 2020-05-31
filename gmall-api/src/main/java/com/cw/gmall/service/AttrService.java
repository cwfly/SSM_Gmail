package com.cw.gmall.service;

import com.cw.gmall.bean.PmsBaseAttrInfo;
import com.cw.gmall.bean.PmsBaseAttrValue;

import java.util.List;
import java.util.Set;

public interface AttrService {

    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<Long> valueIdSet);
}
