package com.water.controller;

import com.water.Biz.*;
import com.water.entity.Address;
import com.water.entity.GuigeList;
import com.water.entity.WaterInfoImageurl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/water")
public class waterController {

    @Autowired
    private AddressBiz addressBiz;

    @Autowired
    private NavBiz navBiz;

    @Autowired
    private WaterInfoBiz waterInfoBiz;

    @Autowired
    private BuyCarBiz buyCarBiz;

    @Autowired
    private OrderDetailBiz orderDetailBiz;

    @Autowired
    private CommentsBiz commentsBiz;

    @Autowired
    private WaterInfoImageurlBiz waterInfoImageurlBiz;

    @Autowired
    private TicketsBiz ticketsBiz;

    @Autowired
    private GuigeListBiz guigeListBiz;

    private String id1="1";
    /**
     * 首页滚动图片
     * @return
     */
    @RequestMapping("/allImageUrl")
    @ResponseBody
    public List<String> getImageUrl(){
        return navBiz.getImageUrl();
    }

    /**
     * 首页桶装水基本展示信息
     * @return
     */
    @RequestMapping("/getBaseWaterInfo")
    @ResponseBody
    public List<Map<String,String>> getBaseWaterInfo(){
        return waterInfoBiz.getBaseWaterInfo();
    }


    /**
     * 桶装水的详细信息
     * @return
     */
    @RequestMapping(value = "/getWaterInfoDetail",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,String>> getWaterInfoDetail(@RequestParam("id") int id){
        return waterInfoBiz.getWaterInfoDetail(id1);
    }

    /**
     * 用户评论
     * @return
     */
    @RequestMapping("/getWaterComment")
    @ResponseBody
    public List<Map<String,String>> getWaterComment(@RequestParam("id") String id,@Param("sign") String sign){
        return commentsBiz.getWaterComment(id1,sign);
    }

    /**
     * 商品详情图片
     * @return
     */
    @RequestMapping("/getWaterDetailImageUrl")
    @ResponseBody
    public List<WaterInfoImageurl> getWaterDetailImageUrl(@RequestParam("id") String id){
        return waterInfoImageurlBiz.getWaterDetailImageUrl(id1);
    }

    /**
     * 规格
     * @return
     */
    @RequestMapping("/getwaterGuiGe")
    @ResponseBody
    public List<GuigeList> getwaterGuiGe(@RequestParam("id") String id){
        return guigeListBiz.getwaterGuiGe(id1);
    }


    /**
     * 订单地址
     * @return
     */
    @RequestMapping( "/getOrderAddress")
    @ResponseBody
    public List<Address> getOrderAddress(@RequestParam("id") String id){
        return addressBiz.getOrderAddress(id1);
    }

    /**
     * 地址管理
     * @return
     */
    @RequestMapping( "/getAllAddress")
    @ResponseBody
    public List<Address> getAllAddress(@RequestParam("id") String id){
        return addressBiz.getAllAddress(id1);
    }

    /**
     * 购物车信息
     * @return
     */
    @RequestMapping("/getBuyCar")
    @ResponseBody
    public List<Map<String,String>> getBuyCar(@RequestParam("id") String id){
        return buyCarBiz.getBuyCar(id1);
    }

    /**
     * 用户订单
     * @return
     */
    @RequestMapping("/getUserOrder")
    @ResponseBody
    public List<Map<String,String>> getUserOrder(@RequestParam("id") String id){
        return orderDetailBiz.getUserOrder(id1);
    }

    /**
     * 用户水票
     * @return
     */
    @RequestMapping("/getUserTickets")
    @ResponseBody
    public String getUserTickets(@RequestParam("id") String id){
        return ticketsBiz.getUserTickets(id1);
    }

}
