/*
Generic implementation of the s3eAudioFocus extension.
This file should perform any platform-indepedentent functionality
(e.g. error checking) before calling platform-dependent implementations.
*/

/*
 * NOTE: This file was originally written by the extension builder, but will not
 * be overwritten (unless --force is specified) and is intended to be modified.
 */


#include "s3eAudioFocus_internal.h"
s3eResult s3eAudioFocusInit()
{
    //Add any generic initialisation code here
    return s3eAudioFocusInit_platform();
}

void s3eAudioFocusTerminate()
{
    //Add any generic termination code here
    s3eAudioFocusTerminate_platform();
}

void s3eAudioFocusRequestFocuse()
{
	s3eAudioFocusRequestFocuse_platform();
}
