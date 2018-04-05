PACKAGES = "${PN} python-gobject-2"
PROVIDES = "python-gobject-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pygobject-2/python-gobject-2_2.28.6-12_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-gobject-2 = "python-gobject-2_2.28.6-12_armhf.deb"
SRC_URI[deb0.sha256sum] = "249f0480b4222b33b16065cae229d67a5fd7b206dc2088084d59a84bf86e713e"
SRC_URI[deb0.md5sum] = "dd74615ac9076f528044ad2110aa1b77"

RDEPENDS_python-gobject-2 = "libc6 (>= 2.13-28) libffi6 (>= 3.0.4) libglib2.0-0 (>= 2.26.0) python (<< 2.8) python (>= 2.7)"
DEPENDS = "libc6 libffi6 libglib2.0-0 python"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-gobject-2 = " \
    ./usr/lib/libpyglib-2.0-python2.7.so.0 \
    ./usr/lib/libpyglib-2.0-python2.7.so.0.0.0 \
    ./usr/lib/pyshared/python2.7/glib/_glib.so \
    ./usr/lib/pyshared/python2.7/gobject/_gobject.so \
    ./usr/lib/pyshared/python2.7/gtk-2.0/gio/_gio.so \
    ./usr/lib/pyshared/python2.7/gtk-2.0/gio/unix.so \
    ./usr/lib/python2.7/dist-packages/glib/__init__.py \
    ./usr/lib/python2.7/dist-packages/glib/_glib.so \
    ./usr/lib/python2.7/dist-packages/glib/option.py \
    ./usr/lib/python2.7/dist-packages/gobject/__init__.py \
    ./usr/lib/python2.7/dist-packages/gobject/_gobject.so \
    ./usr/lib/python2.7/dist-packages/gobject/constants.py \
    ./usr/lib/python2.7/dist-packages/gobject/propertyhelper.py \
    ./usr/lib/python2.7/dist-packages/gtk-2.0-pysupport-compat.pth \
    ./usr/lib/python2.7/dist-packages/gtk-2.0/dsextras.py \
    ./usr/lib/python2.7/dist-packages/gtk-2.0/gio/__init__.py \
    ./usr/lib/python2.7/dist-packages/gtk-2.0/gio/_gio.so \
    ./usr/lib/python2.7/dist-packages/gtk-2.0/gio/unix.so \
    ./usr/lib/python2.7/dist-packages/pygtk.pth \
    ./usr/lib/python2.7/dist-packages/pygtk.py \
    ./usr/share/doc/python-gobject-2/AUTHORS \
    ./usr/share/doc/python-gobject-2/NEWS.gz \
    ./usr/share/doc/python-gobject-2/README \
    ./usr/share/doc/python-gobject-2/changelog.Debian.gz \
    ./usr/share/doc/python-gobject-2/changelog.gz \
    ./usr/share/doc/python-gobject-2/copyright \
    ./usr/share/doc/python-gobject-2/examples/cairo-demo.py \
    ./usr/share/doc/python-gobject-2/examples/option.py \
    ./usr/share/doc/python-gobject-2/examples/properties.py \
    ./usr/share/doc/python-gobject-2/examples/signal.py \
    ./usr/share/pyshared/glib/__init__.py \
    ./usr/share/pyshared/glib/option.py \
    ./usr/share/pyshared/gobject/__init__.py \
    ./usr/share/pyshared/gobject/constants.py \
    ./usr/share/pyshared/gobject/propertyhelper.py \
    ./usr/share/pyshared/gtk-2.0-pysupport-compat.pth \
    ./usr/share/pyshared/gtk-2.0/dsextras.py \
    ./usr/share/pyshared/gtk-2.0/gio/__init__.py \
    ./usr/share/pyshared/pygtk.pth \
    ./usr/share/pyshared/pygtk.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
