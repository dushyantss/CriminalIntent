package dushyant.android.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;

import dushyant.android.criminalintent.util.PictureUtils;

/**
 * Created by Dushyant Singh Shekhawat
 * on 24-06-2016.
 */
public class ZoomedImageDialogFragment extends DialogFragment {

    private static final String ARG_PHOTO_FILE = "photoFile";

    private File mPhotoFile;

    public static ZoomedImageDialogFragment newInstance(File photoFile) {

        Bundle args = new Bundle();
        args.putSerializable(ARG_PHOTO_FILE, photoFile);

        ZoomedImageDialogFragment fragment = new ZoomedImageDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPhotoFile = (File) getArguments().getSerializable(ARG_PHOTO_FILE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_photo, container, false);
        ImageView photoView = (ImageView) v.findViewById(R.id.dialog_photo_image_view);
        photoView.setImageBitmap(PictureUtils.getScaledBitmap(mPhotoFile.getPath(), getActivity()));

        return v;
    }
}
