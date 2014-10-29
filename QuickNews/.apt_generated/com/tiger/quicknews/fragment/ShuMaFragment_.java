//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.tiger.quicknews.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ProgressBar;
import com.tiger.quicknews.R.layout;
import com.tiger.quicknews.adapter.NewAdapter_;
import com.tiger.quicknews.wedget.swiptlistview.SwipeListView;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ShuMaFragment_
    extends com.tiger.quicknews.fragment.ShuMaFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.activity_main, container, false);
        }
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        newAdapter = NewAdapter_.getInstance_(getActivity());
        init();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static ShuMaFragment_.FragmentBuilder_ builder() {
        return new ShuMaFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mProgressBar = ((ProgressBar) hasViews.findViewById(com.tiger.quicknews.R.id.progressBar));
        mListView = ((SwipeListView) hasViews.findViewById(com.tiger.quicknews.R.id.listview));
        swipeLayout = ((SwipeRefreshLayout) hasViews.findViewById(com.tiger.quicknews.R.id.swipe_container));
        if (mListView!= null) {
            mListView.setOnItemClickListener(new OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ShuMaFragment_.this.onItemClick(position);
                }

            }
            );
        }
        initView();
    }

    @Override
    public void getResult(final String result) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                ShuMaFragment_.super.getResult(result);
            }

        }
        );
    }

    @Override
    public void loadNewList(final String url) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    ShuMaFragment_.super.loadNewList(url);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ShuMaFragment_.FragmentBuilder_, com.tiger.quicknews.fragment.ShuMaFragment>
    {


        @Override
        public com.tiger.quicknews.fragment.ShuMaFragment build() {
            ShuMaFragment_ fragment_ = new ShuMaFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
