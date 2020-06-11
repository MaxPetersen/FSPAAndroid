//package com.example.fspa;
//
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RVAdapter extends RecyclerView.Adapter<RVAdapter.AnnouncementViewHolder>{
//
//    List<MainActivity.AnnouncementClass> announcements;
//    RVAdapter(List<MainActivity.AnnouncementClass> announcements){
//        this.announcements = announcements;
//    }
//
//    @NonNull
//    @Override
//    public AnnouncementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AnnouncementViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return announcements.size();
//    }
//
//    public static class AnnouncementViewHolder extends RecyclerView.ViewHolder{
//        CardView cv;
//        ImageView placeholder;
//
//
//        AnnouncementViewHolder(View itemView){
//            super(itemView);
//            //cv = (CardView)itemView.findViewById(R.id.cv);
//            //placeholder = (ImageView)itemView.findViewById(R.id.placeholder_photo);
//
//
//        }
//    }
//}
