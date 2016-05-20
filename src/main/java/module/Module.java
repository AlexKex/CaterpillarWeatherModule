package module;

import iface.Plugable;
import iface.moduleInterface;

/**
 * Created by apryakhin on 28.10.2015.
 */
public abstract class Module implements Plugable {
    protected boolean isLicensed = false;
    protected String myLicenseKey;

    public boolean checkLicense(){
        return true;
    }


}
