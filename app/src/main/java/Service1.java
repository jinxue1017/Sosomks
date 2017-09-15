import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * 创建者:      CaiJianNan
 * 创建时间:   2017/8/5 12:01
 * 描述: TODO
 */

public class Service1  extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
