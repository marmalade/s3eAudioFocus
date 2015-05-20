/*
java implementation of the s3eAudioFocus extension.

Add android-specific functionality here.

These functions are called via JNI from native code.
*/
/*
 * NOTE: This file was originally written by the extension builder, but will not
 * be overwritten (unless --force is specified) and is intended to be modified.
 */
import com.ideaworks3d.marmalade.LoaderAPI;
import com.ideaworks3d.marmalade.LoaderActivity;
import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.util.Log;
// Comment in the following line if you want to use ResourceUtility
// import com.ideaworks3d.marmalade.ResourceUtility;

import 	android.media.AudioManager;

 class s3eAudioFocus  implements OnAudioFocusChangeListener
{
    String TAG = "s3eAudioFocus";
    AudioManager m_audioManager = (AudioManager) LoaderActivity.m_Activity.getSystemService(Context.AUDIO_SERVICE);
    //Context myContext = (Context) LoaderActivity.m_Activity;
    
    @Override
    public void onAudioFocusChange (int focusChange)
    {
    }
    
    public void s3eAudioFocusRequestFocuse()
    {
        Log.d(TAG, "s3eAudioFocusRequestFocuse() called");
        m_audioManager.requestAudioFocus(this, 1,AudioManager.AUDIOFOCUS_GAIN);
    }
}
