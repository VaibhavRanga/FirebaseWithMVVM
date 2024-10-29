package com.vaibhavranga.firebasewithmvvm.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vaibhavranga.firebasewithmvvm.R
import com.vaibhavranga.firebasewithmvvm.databinding.FragmentNoteListingBinding

class NoteListingFragment : Fragment() {
    private lateinit var binding: FragmentNoteListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNoteListingBinding.inflate(inflater, container, false)


        return binding.root
    }
}