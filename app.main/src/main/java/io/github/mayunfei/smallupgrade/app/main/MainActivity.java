package io.github.mayunfei.smallupgrade.app.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.btn_upgrade).setOnClickListener(this);
    findViewById(R.id.btn_feature1).setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()){
      case R.id.btn_upgrade:
        Small.openUri("upgrade",this);
        break;
      case R.id.btn_feature1:
        Small.openUri("feature1",this);
        break;
    }

  }
}
