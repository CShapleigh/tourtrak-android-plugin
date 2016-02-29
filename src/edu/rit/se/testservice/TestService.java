package edu.rit.se.testservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class TestSerice extends Service {

  private static String TAG = "SERVICE TEST";

  @Override
  public IBinder onBind(Intent arg0) {
    return null;
  }

  @Override
  public void onStart(Intent intent, int startId) {
      super.onStart(intent, startId);
      Log.d(TAG, "FUCK: ONSTART");
      this.stopSelf();
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "FUCK: DESTROYED");
  }

}
