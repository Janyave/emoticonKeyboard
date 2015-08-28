package com.learn.emoticonkeyboard;

import java.util.ArrayList;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ChatListAdapter extends BaseAdapter {
	
	private ArrayList<Spanned> comments;
	private Context mContext;
	
	public ChatListAdapter(Context context, ArrayList<Spanned> comments) {
		this.mContext = context;
		this.comments = comments;		
	}
	
	public View getView(final int position, View convertView, ViewGroup parent){

		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.chatlist_item, null);
		}
		
		final Spanned item = comments.get(position);
		
		TextView fans_image = (TextView) convertView.findViewById(R.id.item_text);
		fans_image.setText(item);
		
		return convertView;
		 
		
	}
	
	@Override
	public int getCount() {		
		return comments.size();
	}
	
	@Override
	public Object getItem(int position) {		
		return comments.get(position);
	}
	
	@Override
	public long getItemId(int position) {		
		return position;
	}	
}
