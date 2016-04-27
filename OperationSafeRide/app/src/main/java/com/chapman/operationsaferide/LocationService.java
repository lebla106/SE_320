package com.chapman.operationsaferide;

/**
 * @author Daniel Osterman
 * @version 1
 * Works with built-in GPS Location service
 */

public class LocationService {
    LocationListener gpsListener;
    Location here;
    LocationManager lm;
    Context context;

    protected void onCreate(Context context){
        this.context = context;
        lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        gpsListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                here = location;
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            @Override
            public void onProviderEnabled(String provider) {
            }

            @Override
            public void onProviderDisabled(String provider) {
            }
        };
        try {

            lm.requestLocationUpdates(lm.GPS_PROVIDER, 0, 0, gpsListener);
        }catch(SecurityException e) {
           System.out.println("Error: Location Permission Unavailable");
        }
    }



    public Location getLocation(){
        try {
            here = lm.getLastKnownLocation(lm.GPS_PROVIDER);
        }catch(SecurityException e) {
            System.out.println("Error: Can't obtain Location");
        }

        return here;
    }
    
}
