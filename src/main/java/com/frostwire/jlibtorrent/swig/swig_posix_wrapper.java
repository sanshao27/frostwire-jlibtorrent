/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_posix_wrapper {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected swig_posix_wrapper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_posix_wrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_posix_wrapper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_posix_wrapper_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_posix_wrapper_change_ownership(this, swigCPtr, true);
  }

  public int open(String pathname, int flags, int mode) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_open(swigCPtr, this, pathname, flags, mode) : libtorrent_jni.swig_posix_wrapper_openSwigExplicitswig_posix_wrapper(swigCPtr, this, pathname, flags, mode);
  }

  public int open64(String pathname, int flags, int mode) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_open64(swigCPtr, this, pathname, flags, mode) : libtorrent_jni.swig_posix_wrapper_open64SwigExplicitswig_posix_wrapper(swigCPtr, this, pathname, flags, mode);
  }

  public int openat(int dirfd, String pathname, int flags, int mode) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_openat(swigCPtr, this, dirfd, pathname, flags, mode) : libtorrent_jni.swig_posix_wrapper_openatSwigExplicitswig_posix_wrapper(swigCPtr, this, dirfd, pathname, flags, mode);
  }

  public int creat(String pathname, int mode) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_creat(swigCPtr, this, pathname, mode) : libtorrent_jni.swig_posix_wrapper_creatSwigExplicitswig_posix_wrapper(swigCPtr, this, pathname, mode);
  }

  public int mkdir(String pathname, int mode) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_mkdir(swigCPtr, this, pathname, mode) : libtorrent_jni.swig_posix_wrapper_mkdirSwigExplicitswig_posix_wrapper(swigCPtr, this, pathname, mode);
  }

  public int rename(String oldpath, String newpath) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_rename(swigCPtr, this, oldpath, newpath) : libtorrent_jni.swig_posix_wrapper_renameSwigExplicitswig_posix_wrapper(swigCPtr, this, oldpath, newpath);
  }

  public int remove(String pathname) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_remove(swigCPtr, this, pathname) : libtorrent_jni.swig_posix_wrapper_removeSwigExplicitswig_posix_wrapper(swigCPtr, this, pathname);
  }

  public int lstat(String path, swig_posix_stat buf) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_lstat(swigCPtr, this, path, swig_posix_stat.getCPtr(buf), buf) : libtorrent_jni.swig_posix_wrapper_lstatSwigExplicitswig_posix_wrapper(swigCPtr, this, path, swig_posix_stat.getCPtr(buf), buf);
  }

  public int stat(String path, swig_posix_stat buf) {
    return (getClass() == swig_posix_wrapper.class) ? libtorrent_jni.swig_posix_wrapper_stat(swigCPtr, this, path, swig_posix_stat.getCPtr(buf), buf) : libtorrent_jni.swig_posix_wrapper_statSwigExplicitswig_posix_wrapper(swigCPtr, this, path, swig_posix_stat.getCPtr(buf), buf);
  }

  public swig_posix_wrapper() {
    this(libtorrent_jni.new_swig_posix_wrapper(), true);
    libtorrent_jni.swig_posix_wrapper_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
