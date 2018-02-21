package com.app.lianxi.myapplication1.adapter.base;

import android.content.Context;
import android.graphics.Paint;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.vo.CosmeticsBuySell;
import com.lidroid.xutils.BitmapUtils;

import java.util.ArrayList;

/**
 * Created by dell on 2018/2/18.
 */

public class ListItemAdapter extends BaseAdapter {
    private String path=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES+"/CodingStore").getAbsolutePath();//图片缓存的路径
    private Context context;
    private ArrayList<CosmeticsBuySell> cosmeticsBuySells;
   private BitmapUtils bitmapUtils;

   public ListItemAdapter(Context context,ArrayList<CosmeticsBuySell> cosmeticsBuySells){
      this.context=context;
      this.cosmeticsBuySells=cosmeticsBuySells;
      bitmapUtils =new BitmapUtils(context,path);
      bitmapUtils.configDefaultBitmapMaxSize(100,100);
  }
@Override
  public int getCount(){
   return cosmeticsBuySells.size() ;


}
   @Override
  public Object getItem(int position){
       return cosmeticsBuySells.get(position) ;
  }

   @Override
   public long getItemId(int position){
     return  position;
 }
    @Override
 public View getView(int position, View convertView, ViewGroup parent){
     if (convertView==null) {
         convertView= LayoutInflater.from(context).inflate(R.layout.new_cosmetics1,null);
       }
        TextView tv_name=ViewHolder.getView(convertView,R.id.textView_Name);
        TextView textView3_star=ViewHolder.getView(convertView,R.id.textView3_star);
        TextView textView5_price=ViewHolder.getView(convertView,R.id.textView5_price);
        TextView textView7_discountPrice=ViewHolder.getView(convertView,R.id.textView7_discountPrice);
        TextView textView8_discount=ViewHolder.getView(convertView,R.id.textView8_discount);
        ImageView imageView_image=ViewHolder.getView(convertView,R.id.imageView_Image);



        CosmeticsBuySell cosmeticsBuySell=cosmeticsBuySells.get(position);
        tv_name.setText(cosmeticsBuySell.getName());
        textView3_star.setText(cosmeticsBuySell.getStar()+"星");
       textView5_price.setText("原价：￥"+String.valueOf(cosmeticsBuySell.getPrice()+"*1.25"));
        textView5_price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        textView7_discountPrice.setText("￥"+String .valueOf(cosmeticsBuySell.getPrice()));//这里要获取什么价格？对
        textView8_discount.setText(String.valueOf("8"+"折"));//哪个字段按是打折字段？这个你自己像怎么处理先给你写成死的

 //运行到你手机上了？我看不到效果了其他的你自己整吧





      //显示图片
      bitmapUtils.display(imageView_image,cosmeticsBuySell.getImage());//这个方法找再写一个行吗 不知道你这里想干嘛，加载图片路径？首页列表不是有图片吗一个一个的




      return convertView ;
    }

    public ArrayList<CosmeticsBuySell> getCosmeticsBuySells() {
        return cosmeticsBuySells;
    }

    public void setCosmeticsBuySells(ArrayList<CosmeticsBuySell> cosmeticsBuySells) {
        this.cosmeticsBuySells = cosmeticsBuySells;
    }
}
