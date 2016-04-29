/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public interface libtorrentConstants {
  public final static int LIBTORRENT_VERSION_MAJOR = libtorrent_jni.LIBTORRENT_VERSION_MAJOR_get();
  public final static int LIBTORRENT_VERSION_MINOR = libtorrent_jni.LIBTORRENT_VERSION_MINOR_get();
  public final static int LIBTORRENT_VERSION_TINY = libtorrent_jni.LIBTORRENT_VERSION_TINY_get();
  public final static int LIBTORRENT_VERSION_NUM = libtorrent_jni.LIBTORRENT_VERSION_NUM_get();
  public final static String LIBTORRENT_VERSION = libtorrent_jni.LIBTORRENT_VERSION_get();
  public final static String LIBTORRENT_REVISION = libtorrent_jni.LIBTORRENT_REVISION_get();
  public final static int num_alert_types = libtorrent_jni.num_alert_types_get();

  public final static int ed25519_seed_size = libtorrent_jni.ed25519_seed_size_get();
  public final static int ed25519_private_key_size = libtorrent_jni.ed25519_private_key_size_get();
  public final static int ed25519_public_key_size = libtorrent_jni.ed25519_public_key_size_get();
  public final static int ed25519_signature_size = libtorrent_jni.ed25519_signature_size_get();
  public final static int ed25519_scalar_size = libtorrent_jni.ed25519_scalar_size_get();
  public final static int ed25519_shared_secret_size = libtorrent_jni.ed25519_shared_secret_size_get();

  public final static String LIBTORRENT_REVISION_SHA1 = libtorrent_jni.LIBTORRENT_REVISION_SHA1_get();
  public final static String JLIBTORRENT_REVISION_SHA1 = libtorrent_jni.JLIBTORRENT_REVISION_SHA1_get();
}
