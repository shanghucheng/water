package com.water.controller;

import com.water.Vo.WaterTypeVo;
import com.water.biz.*;
import com.water.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/water")
public class waterController {

    @Autowired
    private UserInfoBiz userInfoBiz;

    @Autowired
    private ImgUrlsBiz imgUrlsBiz;

    @Autowired
    private WaterInfoBiz waterInfoBiz;

    @Autowired
    private AddressBiz addressBiz;

    @Autowired
    private OrdersBiz ordersBiz;

    @Autowired
    private OrdersdetailBiz ordersdetailBiz;

    @Autowired
    private WaterTypeBiz waterTypeBiz;


    @RequestMapping(value = "/inserUser", method = RequestMethod.GET)
    @ResponseBody
    public int insertUser(@RequestParam("nickName") String nickName, @RequestParam("gender") String gender, @RequestParam("language") String language, @RequestParam("province") String province, @RequestParam("city") String city, @RequestParam("country") String country, @RequestParam("avatarUrl") String avatarUrl) {
        return userInfoBiz.insertUser(nickName, gender, language, province, city, country, avatarUrl);
    }

    /**
     * 获取首页的轮播图
     *
     * @return
     */
    @RequestMapping(value = "/getNav", method = RequestMethod.GET)
    @ResponseBody
    public List<ImgUrls> getNav() {
        List<ImgUrls> getNav = imgUrlsBiz.getNav();
        return getNav;
    }

    /**
     * 获取首页商品列表
     *
     * @return
     */
    @RequestMapping(value = "/getWaterInfo", method = RequestMethod.GET)
    @ResponseBody
//    public List<WaterInfo> getWaterInfo(@RequestParam("isCart") String isCart,@RequestParam("isTab") String isTab){
    public List<WaterInfo> getWaterInfo(@RequestParam("isTab") String isTab, @RequestParam(value = "typeId", required = false) String typeId) {

        List<WaterInfo> getWaterInfo = waterInfoBiz.getWaterInfo("0", isTab, typeId);
        return getWaterInfo;
    }

    /**
     * 获取商品的详细信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getWaterInfoById", method = RequestMethod.GET)
    @ResponseBody
    public WaterInfo getWaterInfoById(@RequestParam("id") String id) {
        WaterInfo getWaterInfoById = waterInfoBiz.getWaterInfoById(id);
        return getWaterInfoById;
    }

    /**
     * 获取商品详情的轮播图
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getImagesByWaterId", method = RequestMethod.GET)
    @ResponseBody
    public List<ImgUrls> getImagesByWaterId(@RequestParam("id") String id) {
        List<ImgUrls> getImagesByWaterId = imgUrlsBiz.getImagesByWaterId(id);
        return getImagesByWaterId;
    }

    /**
     * 获取商品详情的图文详情
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getGoodDetailImg", method = RequestMethod.GET)
    @ResponseBody
    public List<ImgUrls> getGoodDetailImg(@RequestParam("id") String id) {
        List<ImgUrls> getGoodDetailImg = imgUrlsBiz.getGoodDetailImg(id);
        return getGoodDetailImg;
    }

    /**
     * 修改商品的库存和销量
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/updateStockAndSalesvolume", method = RequestMethod.GET)
    @ResponseBody
    public boolean updateStockAndSalesvolume(@RequestParam("id") String id, @RequestParam("stock") String stock, @RequestParam("salesvolume") String salesvolume) {
        waterInfoBiz.updateStockAndSalesvolume(id, stock, salesvolume);
        return true;
    }

    /**
     * 获取用户的收获地址
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUserAddress", method = RequestMethod.GET)
    @ResponseBody
    public List<Address> getUserAddress(@RequestParam("id") String id) {
        List<Address> getUserAddress = addressBiz.getUserAddress(id);
        return getUserAddress;
    }

    /**
     * 添加用户地址
     *
     * @param userid
     * @param username
     * @param telnumber
     * @param add
     * @param address2
     * @return
     */
    @RequestMapping(value = "/insertAddress", method = RequestMethod.GET)
    @ResponseBody
    public boolean insertAddress(@RequestParam("userid") String userid, @RequestParam("username") String username, @RequestParam("telnumber") String telnumber, @RequestParam("add") String add, @RequestParam("address2") String address2) {
        addressBiz.insertAddress(userid, username, telnumber, add, address2);
        return true;
    }

    /**
     * 修改用户地址
     *
     * @param id
     * @param username
     * @param telnumber
     * @param add
     * @param address2
     * @return
     */
    @RequestMapping(value = "/updateAddress", method = RequestMethod.GET)
    @ResponseBody
    public boolean updateAddress(@RequestParam("id") String id, @RequestParam("username") String username, @RequestParam("telnumber") String telnumber, @RequestParam("add") String add, @RequestParam("address2") String address2) {
        addressBiz.updateAddress(id, username, telnumber, add, address2);
        return true;
    }

    /**
     * 删除用户地址
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteAddress", method = RequestMethod.GET)
    @ResponseBody
    public boolean deleteAddress(@RequestParam("id") String id) {
        addressBiz.deleteAddress(id);
        return true;
    }

    /**
     * 添加用户订单
     *
     * @param userid
     * @param totalnum
     * @param totalprice
     * @param addressid
     * @param orderstate
     * @return
     */
    @RequestMapping(value = "/insertOrder", method = RequestMethod.GET)
    @ResponseBody
    public int insertOrder(@RequestParam("userid") String userid, @RequestParam("addressid") String addressid, @RequestParam("totalnum") String totalnum, @RequestParam("totalprice") String totalprice, @RequestParam("orderstate") String orderstate) {
        return ordersBiz.insertOrder(userid, addressid, totalnum, totalprice, orderstate);
    }

    /**
     * 查询订单
     *
     * @param userid
     * @param orderstate
     * @return
     */
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    @ResponseBody
    public List<Orders> getOrder(@RequestParam("userid") String userid, @RequestParam("orderstate") String orderstate) {
        List<Orders> getOrder = ordersBiz.getOrder(userid, orderstate);
        return getOrder;
    }

    /**
     * 添加订单详情
     *
     * @param orderid
     * @param waterid
     * @param goodsnum
     * @param goodsprice
     * @return
     */
    @RequestMapping(value = "/insertOrderDetail", method = RequestMethod.GET)
    @ResponseBody
    public boolean insertOrderDetail(@RequestParam("orderid") String orderid, @RequestParam("waterid") String waterid, @RequestParam("goodsnum") String goodsnum, @RequestParam("goodsprice") String goodsprice) {
        ordersdetailBiz.insertOrderDetail(orderid, waterid, goodsnum, goodsprice);
        return true;
    }

    /**
     * 获取分类列表
     *
     * @return
     */
    @RequestMapping(value = "/getWaterType", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getWaterType() {
        List<Map<String, Object>> getW = waterTypeBiz.getWaterType();
        return getW;
    }

    /**
     * 根据分类id查询商品
     *
     * @param typeId
     * @return
     */
    @RequestMapping(value = "/getWaterAll", method = RequestMethod.GET)
    @ResponseBody
    public List<WaterInfo> getWaterByTypeId(@RequestParam("typeId") String typeId) {
        List<WaterInfo> getWaterByTypeId = waterInfoBiz.getWaterByTypeId(typeId);
        return getWaterByTypeId;
    }

    /**
     * 获取搜索结果
     *
     * @param value
     * @return
     */
    @RequestMapping(value = "/getSearchResult", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getSearchResult(@RequestParam("value") String value) {
        List<Map<String, String>> getSearchResult = waterTypeBiz.getSearchResult(value);
        return getSearchResult;
    }

    /**
     * 获取订单详情
     *
     * @param orderid
     * @return
     */
    @RequestMapping(value = "/getOrderDetailByOrderId", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getOrderDetailByOrderId(@RequestParam("orderid") String orderid) {
        List<Map<String, String>> getOrderDetailByOrderId = ordersdetailBiz.getOrderDetailByOrderId(orderid);
        return getOrderDetailByOrderId;
    }

    /**
     * 通过id获取订单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getOrderById", method = RequestMethod.GET)
    @ResponseBody
    public Orders getOrderById(@RequestParam("id") String id) {
        Orders getOrderById = ordersBiz.getOrderById(id);
        return getOrderById;
    }

    /**
     * 获取待接单订单
     *
     * @return
     */
    @RequestMapping(value = "/getOrderByState", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getOrderByState() {
        List<Map<String, String>> getOrderByState = ordersBiz.getOrderByState();
        return getOrderByState;
    }

    /**
     * 更新订单状态
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/updateOrderStateById", method = RequestMethod.GET)
    @ResponseBody
    public boolean updateOrderStateById(@RequestParam("orderstate") String orderstate, @RequestParam("id") String id) {
        ordersBiz.updateOrderStateById(orderstate, id);
        return true;
    }

    /**
     * ************************************骑手************************************************
     */

    @Autowired
    private RiderOrderBiz riderOrderBiz;

    @Autowired
    private RiderBiz riderBiz;

    /**
     * 获取骑手订单
     *
     * @return
     */
    @RequestMapping(value = "/getRiderOrderAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getRiderOrderAll(@RequestParam(value = "id") String id,@RequestParam(value = "orderstate", required = false) String orderstate) {
        List<Map<String, String>> getRiderOrderAll = riderOrderBiz.getRiderOrderAll(id,orderstate);
        return getRiderOrderAll;
    }

    /**
     * 添加骑手接单
     *
     * @param rigerid
     * @param orderid
     * @return
     */
    @RequestMapping(value = "/insertRiderOrder", method = RequestMethod.GET)
    @ResponseBody
    public boolean insertRiderOrder(@RequestParam("rigerid") String rigerid, @RequestParam("orderid") String orderid) {
        riderOrderBiz.insertRiderOrder(rigerid, orderid);
        return true;
    }

    /**
     * 获取骑手的订单详情
     *
     * @param orderid
     * @param riderid
     * @return
     */
    @RequestMapping(value = "/getRiderOrderDetailById", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getRiderOrderDetailById(@RequestParam("orderid") String orderid, @RequestParam("riderid") String riderid) {
        List<Map<String, String>> getRiderOrderDetailById = ordersBiz.getRiderOrderDetailById(orderid, riderid);
        return getRiderOrderDetailById;
    }

    /**
     * 判断手机号是否被注册
     *
     * @param tel
     * @return
     */
    @RequestMapping(value = "/getRiderByTel", method = RequestMethod.GET)
    @ResponseBody
    public String getRiderByTel(@RequestParam("tel") String tel) {
        return riderBiz.getRiderByTel(tel);
    }

    /**
     * 添加骑手
     *
     * @param name
     * @param passwrod
     * @param tel
     * @return
     */
    @RequestMapping(value = "/insertRider", method = RequestMethod.GET)
    @ResponseBody
    public int insertRider(@RequestParam("name") String name, @RequestParam("passwrod") String passwrod, @RequestParam("tel") String tel) {
        return riderBiz.insertRider(name, passwrod, tel);
    }

    /**
     * 骑手登录
     * @param tel
     * @param passwrod
     * @return
     */
    @RequestMapping(value = "/getRiderByTelPassword", method = RequestMethod.GET)
    @ResponseBody
    public Rider getRiderByTelPassword(@RequestParam("tel") String tel, @RequestParam("passwrod") String passwrod) {
        return riderBiz.getRiderByTelPassword(tel, passwrod);
    }

    /**
     * 获取骑手得月，周订单
     * @param id
     * @param sign
     * @return
     */
    @RequestMapping(value = "/getRiderOrderById", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,String>> getRiderOrderById(@RequestParam("id") String id,@RequestParam("sign") String sign){
        return riderOrderBiz.getRiderOrderById(id, sign);
    }

    /**
     * 获取骑手排名
     * @return
     */
    @RequestMapping(value = "/getRiderRank", method = RequestMethod.GET)
    @ResponseBody
    public List<Rider> getRiderRank(){
        return riderBiz.getRiderRank();
    }

}
