package com.example.lorcollectorsapp.ui.addCards

import com.example.lorcollectorsapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lorcollectorsapp.databinding.FragmentAddCardsBinding


class AddCards : Fragment() {

    private lateinit var addCardsViewModel: AddCardsViewModel
    private var _binding: FragmentAddCardsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addCardsViewModel =
            ViewModelProvider(this).get(AddCardsViewModel::class.java)

        _binding = FragmentAddCardsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val imageView: ImageView = binding.cardViewer

        var uri = R.drawable._6bc026

        when((0..10).random()){
            0 -> uri = R.drawable._6bc030
            1 -> uri = R.drawable._6bc031
            2 -> uri = R.drawable._6bc036
            3 -> uri = R.drawable._6bw011
            4 -> uri = R.drawable._6bw030
            5 -> uri = R.drawable._6bw036
            6 -> uri = R.drawable._6fr033
            7 -> uri = R.drawable._6io005
            8 -> uri = R.drawable._6mt036
            9 -> uri = R.drawable._6nx012t6
            10 -> uri = R.drawable._6ru046
        }

        imageView.apply {
            setImageResource(uri)
        }


        /*
        val uri = "@drawable/_6bc036" // where myresource (without the extension) is the file

        val imageResource = resources.getIdentifier(uri, null, "drawable")

        val res = resources.getDrawable(imageResource)
        imageView.setImageDrawable(res)

        //var image: Bitmap = Bitmap.createBitmap()
        //imageView.setImageBitmap()
        */
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}