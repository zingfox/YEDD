package com.zingfox.yedd;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class BlogFeedActivity extends ActionBarActivity {

    private FrameLayout rootLayout;
    private FloatingActionButton newBlogBtn;
    private TabLayout tabLayout;

    //private ListView blogListView;
    //private List<Blog> blogs;
    //private FeedAdapter feedAdapter;
    //private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_feed);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Feed"));
        tabLayout.addTab(tabLayout.newTab().setText("Noti"));
        tabLayout.addTab(tabLayout.newTab().setText("Friend"));
        tabLayout.addTab(tabLayout.newTab().setText("Fav"));

        rootLayout = (FrameLayout) findViewById(R.id.rootLayout);

        newBlogBtn = (FloatingActionButton) findViewById(R.id.newBlogBtn);
        newBlogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(rootLayout, "YeddddddDDDD", Snackbar.LENGTH_SHORT)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //Intent intent = new Intent(context, CreateBlogActivity.class);
                                //startActivity(intent);
                                //finish();
                            }
                        })
                .show();
            }
        });

        //blogListView = (ListView) findViewById(R.id.blog_list);

        //inputBlog();
        //feedAdapter = new FeedAdapter(this, blogs);
        //blogListView.setAdapter(feedAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blog_feed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*
    private void inputBlog() {
        blogs.add(new Blog("TEST"));
        blogs.add(new Blog("YEDD"));
        blogs.add(new Blog("NOOO"));
    }
    */
}

