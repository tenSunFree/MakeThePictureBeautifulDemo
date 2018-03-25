package com.yyx.beautifylib.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yyx.beautifylib.R;
import com.yyx.beautifylib.model.Filter_Effect_Info;

import java.util.List;

/**
 * 特效
 * @author Administrator
 *
 */
public class Filter_Effect_Adapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private List<Filter_Effect_Info> mData;
	private Context mContext;
	private int selectItem = 0;

	public Filter_Effect_Adapter(Context context, List<Filter_Effect_Info> mData) {
		this.mContext = context;
		this.mInflater = LayoutInflater.from(mContext);
		this.mData = mData;
	}

	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
			ViewHolder holder = new ViewHolder();
			if(convertView == null){
				convertView = mInflater.inflate(R.layout.camerasdk_item_effect, null);
				holder.img = (ImageView) convertView.findViewById(R.id.effect_img);
				holder.title = (TextView) convertView.findViewById(R.id.title);
				holder.item_back = (LinearLayout)convertView.findViewById(R.id.item_back);
				convertView.setTag(holder);
			}
			else{
				holder = (ViewHolder) convertView.getTag();
			}

			Filter_Effect_Info mEffect = mData.get(position);
			
			holder.img.setImageResource(mEffect.getIconId());
			holder.title.setText(mEffect.getName());

			if (position == selectItem) {
				//holder.item_back.setBackgroundColor(Color.YELLOW);
				holder.item_back.setBackgroundColor(0xff52733b);
				holder.title.setTextColor(0xffe4ebf2);
			} 
			else {
				holder.item_back.setBackgroundColor(0xff52733b);
				holder.title.setTextColor(0x50e4ebf2);
			}

			return convertView;
	}

	public void setSelectItem(int selectItem) {
		this.selectItem = selectItem;
		this.notifyDataSetChanged();
	}

	public final class ViewHolder {
		public LinearLayout item_back;
		public ImageView img; // 图像
		public TextView title;// 标题
	}
}



