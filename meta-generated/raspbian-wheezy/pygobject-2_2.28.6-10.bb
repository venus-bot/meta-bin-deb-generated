PACKAGES = "python-gobject-2"
PROVIDES = "python-gobject-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pygobject-2/python-gobject-2_2.28.6-10_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-gobject-2 = "python-gobject-2_2.28.6-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "03b3f30470ee46192063140f3930dd7c846b948f5a09fc0b0f0dd89841073ed5"
SRC_URI[deb0.md5sum] = "86e7808d3a4476dbd761436a78ed0184"

RDEPENDS_python-gobject-2 = "python2.7 python (>= 2.6.6-7~) python (<< 2.8) libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libglib2.0-0 (>= 2.24.0)"
DEPENDS = "python libffi5 libglib2.0-0 python2.7 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-gobject-2 = " \
	./usr/share/pyshared/pygtk.pth \
	./usr/lib/python2.6/dist-packages/gtk-2.0/gio/unix.so \
	./usr/lib/python2.6/dist-packages/glib/option.py \
	./usr/lib/python2.6/dist-packages/glib/__init__.py \
	./usr/lib/python2.6/dist-packages/gtk-2.0/dsextras.py \
	./usr/share/doc/python-gobject-2/examples/signal.py \
	./usr/lib/python2.7/dist-packages/gobject/constants.py \
	./usr/lib/python2.7/dist-packages/gobject/propertyhelper.py \
	./usr/lib/pyshared/python2.6/gtk-2.0/gio/unix.so \
	./usr/lib/python2.6/dist-packages/gobject/_gobject.so \
	./usr/lib/pyshared/python2.6/glib/_glib.so \
	./usr/share/pyshared/gobject/constants.py \
	./usr/share/pyshared/gtk-2.0/gio/__init__.py \
	./usr/lib/pyshared/python2.6/gtk-2.0/gio/_gio.so \
	./usr/lib/python2.7/dist-packages/pygtk.py \
	./usr/share/doc/python-gobject-2/changelog.Debian.gz \
	./usr/lib/python2.6/dist-packages/glib/_glib.so \
	./usr/lib/python2.6/dist-packages/pygtk.pth \
	./usr/lib/python2.6/dist-packages/pygtk.py \
	./usr/share/pyshared/glib/__init__.py \
	./usr/lib/pyshared/python2.7/gobject/_gobject.so \
	./usr/lib/libpyglib-2.0-python2.6.so.0 \
	./usr/lib/libpyglib-2.0-python2.7.so.0 \
	./usr/lib/python2.7/dist-packages/gtk-2.0/gio/unix.so \
	./usr/lib/python2.7/dist-packages/gtk-2.0/gio/__init__.py \
	./usr/lib/python2.6/dist-packages/gobject/propertyhelper.py \
	./usr/lib/python2.7/dist-packages/gobject/__init__.py \
	./usr/share/pyshared/pygtk.py \
	./usr/share/doc/python-gobject-2/examples/cairo-demo.py \
	./usr/share/doc/python-gobject-2/NEWS.gz \
	./usr/lib/libpyglib-2.0-python2.6.so.0.0.0 \
	./usr/share/doc/python-gobject-2/AUTHORS \
	./usr/lib/pyshared/python2.7/glib/_glib.so \
	./usr/lib/python2.7/dist-packages/pygtk.pth \
	./usr/share/doc/python-gobject-2/copyright \
	./usr/share/doc/python-gobject-2/changelog.gz \
	./usr/lib/python2.7/dist-packages/glib/option.py \
	./usr/share/pyshared/glib/option.py \
	./usr/lib/python2.7/dist-packages/glib/__init__.py \
	./usr/lib/python2.7/dist-packages/gtk-2.0/dsextras.py \
	./usr/lib/pyshared/python2.6/gobject/_gobject.so \
	./usr/share/pyshared/gobject/__init__.py \
	./usr/share/pyshared/gtk-2.0/dsextras.py \
	./usr/lib/pyshared/python2.7/gtk-2.0/gio/unix.so \
	./usr/lib/python2.7/dist-packages/glib/_glib.so \
	./usr/share/doc/python-gobject-2/examples/option.py \
	./usr/lib/python2.7/dist-packages/gtk-2.0/gio/_gio.so \
	./usr/lib/python2.6/dist-packages/gobject/constants.py \
	./usr/lib/libpyglib-2.0-python2.7.so.0.0.0 \
	./usr/lib/python2.6/dist-packages/gtk-2.0-pysupport-compat.pth \
	./usr/lib/python2.7/dist-packages/gobject/_gobject.so \
	./usr/lib/python2.6/dist-packages/gtk-2.0/gio/_gio.so \
	./usr/share/doc/python-gobject-2/README \
	./usr/share/pyshared/gobject/propertyhelper.py \
	./usr/share/doc/python-gobject-2/examples/properties.py \
	./usr/lib/python2.7/dist-packages/gtk-2.0-pysupport-compat.pth \
	./usr/lib/pyshared/python2.7/gtk-2.0/gio/_gio.so \
	./usr/lib/python2.6/dist-packages/gtk-2.0/gio/__init__.py \
	./usr/lib/python2.6/dist-packages/gobject/__init__.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
