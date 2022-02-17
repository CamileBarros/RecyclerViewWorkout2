package com.camile.recyclerviewworkout2

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.seven_wonders_details.*
import kotlinx.android.synthetic.main.seven_wonders_list.*
import java.security.AccessController.getContext

class SevenWondersDetails () : Fragment(R.layout.seven_wonders_details) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val photoDetail = requireArguments().getInt("photo")
//        val descriptionDetail = requireArguments().getInt("description")

//        Log.i(TAG, "onCreate $photoDetail - $descriptionDetail")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // setupDetails(wonderPhoto, wonderDescription)
    }

    private fun setupDetails(photoDetail: String, descriptionDetail: String){

        val requestOptions = RequestOptions()

        Glide.with(this)
            .applyDefaultRequestOptions(requestOptions)
            .load(photoDetail)
            .into(photo_details)


    }

}