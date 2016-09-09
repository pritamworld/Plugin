package aidl.adesa.priteshpatel.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;



public class PluginService2 extends Service {
	static final String LOG_TAG = PluginService2.class.getCanonicalName();


	public void onStart(Intent intent, int startId) {
		super.onStart( intent, startId );
	}

	public void onDestroy() {
		super.onDestroy();
	}

	public IBinder onBind(Intent intent) {
		return mulBinder;
	}

    private final IOperation.Stub mulBinder =
			new IOperation.Stub() {
		public int operation( int i1, int i2 ) {
			return i1*i2;
		}
    };

}

