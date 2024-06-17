package com.pardeep.fragment_lifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    //onCreateView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    //onViewCreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "onViewCreated", Toast.LENGTH_SHORT).show()
    }

    //onViewedStateRestored
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Toast.makeText(requireContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show()
    }

    //onStart
    override fun onStart() {
        super.onStart()
        Toast.makeText(requireContext(), "onStart", Toast.LENGTH_SHORT).show()
    }

    //onResume
    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(), "onResume", Toast.LENGTH_SHORT).show()
    }

    //onPause
    override fun onPause() {
        super.onPause()
        Toast.makeText(requireContext(), "onPause", Toast.LENGTH_SHORT).show()
    }

    //onStop
    override fun onStop() {
        super.onStop()
        Toast.makeText(requireContext(),"onStop",Toast.LENGTH_SHORT).show()
    }

    //onSaveInstanceState
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Toast.makeText(requireContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show()
    }

    //onDestroyView
    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(requireContext(), "onDestroyView", Toast.LENGTH_SHORT).show()
    }

    //onDestroy
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(), "onDestroy", Toast.LENGTH_SHORT).show()
    }



}