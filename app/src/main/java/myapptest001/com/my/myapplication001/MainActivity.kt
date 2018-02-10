package myapptest001.com.my.myapplication001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //这不是java语言。。。。
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    class TestClass : Serializable {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
    }

}
