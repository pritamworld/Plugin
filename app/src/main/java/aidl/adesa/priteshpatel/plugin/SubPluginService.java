package aidl.adesa.priteshpatel.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SubPluginService extends Service {
    static final String LOG_TAG = SubPluginService.class.getCanonicalName();

    public void onStart(Intent intent, int startId) {
        super.onStart( intent, startId );
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        return addBinder;
    }

    private final IOperation.Stub addBinder =
            new IOperation.Stub() {
                public int operation( int i1, int i2 ) {
                    return i1-i2;
                }
            };
}
