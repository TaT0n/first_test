package ru.rsue.test.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ru.rsue.test.test.database.CrimeBaseHelper;

/**
 * Created by TaTon on 28.02.2018.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static CrimeLab get(Context context){
        if (sCrimeLab==null){
            sCrimeLab=new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mContext=context.getApplicationContext();
        mDatabase=new CrimeBaseHelper(mContext)
                .getWritableDatabase();
//        mAppContext = appContext;
        mCrimes=new ArrayList<>();
//        for (int i=0;i<100;i++){
//            Crime crime=new Crime();
//            crime.setTitle("Crime #"+i);
//            crime.setSolved(i%2==0); //Для каждого второго объекта
//            mCrimes.add(crime);
//        }
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    public List<Crime> getmCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
