PACKAGES = "python-gi python-gobject"
PROVIDES = "python-gi python-gobject"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pygobject/python-gi_3.2.2-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pygobject/python-gobject_3.2.2-2_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-gi = "python-gi_3.2.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "b3383dc4b91dadf53233575dff156a2f2ff3695a4e69ecbca151c8f7cda29723"
SRC_URI[deb0.md5sum] = "3074e77ebd0310db5953f9c08d2ed688"
DEBFILENAME_python-gobject = "python-gobject_3.2.2-2_all.deb"
SRC_URI[deb1.sha256sum] = "0ee0b3bce53ad29e68145f30f54b6369c6d49bd48f2c77e0500f55363ab0a7f8"
SRC_URI[deb1.md5sum] = "c27d42a8866a4c8a9a398d5489dd5baa"

RDEPENDS_python-gi = "python (>= 2.6.6-7~) python (<< 2.8) libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libgirepository-1.0-1 (>= 1.29.0) libglib2.0-0 (>= 2.31.8) gir1.2-glib-2.0 (>= 1.31.0)"
RDEPENDS_python-gobject = "python-gi (>= 3.2.2-2) python-gobject-2"
DEPENDS = "libglib2.0-0 python gir1.2-glib-2.0 libffi5 libgirepository-1.0-1 libc6 python-gobject-2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-gi = " \
	./usr/lib/libpyglib-gi-2.0-python2.6.so.0.0.0 \
	./usr/share/pyshared/gi/overrides/Gtk.py \
	./usr/share/pyshared/gi/_glib/option.py \
	./usr/lib/pyshared/python2.6/gi/_gi.so \
	./usr/lib/python2.7/dist-packages/gi/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/types.py \
	./usr/lib/python2.6/dist-packages/gi/overrides/Gdk.py \
	./usr/share/pyshared/gi/_glib/__init__.py \
	./usr/lib/libpyglib-gi-2.0-python2.6.so \
	./usr/lib/python2.6/dist-packages/gi/overrides/keysyms.py \
	./usr/lib/pyshared/python2.7/gi/_gobject/_gobject.so \
	./usr/lib/libpyglib-gi-2.0-python2.6.so.0 \
	./usr/lib/pyshared/python2.7/gi/_glib/_glib.so \
	./usr/lib/pyshared/python2.7/gi/_gi.so \
	./usr/lib/python2.7/dist-packages/gi/overrides/Gtk.py \
	./usr/lib/python2.7/dist-packages/gi/types.py \
	./usr/share/pyshared/gi/importer.py \
	./usr/lib/python2.6/dist-packages/gi/_gobject/propertyhelper.py \
	./usr/share/doc/python-gi/NEWS.gz \
	./usr/lib/python2.6/dist-packages/gi/_glib/option.py \
	./usr/share/pyshared/gi/overrides/Gio.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/Gdk.py \
	./usr/share/pyshared/gi/overrides/Pango.py \
	./usr/lib/libpyglib-gi-2.0-python2.7.so.0.0.0 \
	./usr/share/pyshared/gi/repository/__init__.py \
	./usr/share/pyshared/gi/_gobject/constants.py \
	./usr/lib/python2.7/dist-packages/gi/_glib/__init__.py \
	./usr/share/pyshared/gi/_gobject/propertyhelper.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/keysyms.py \
	./usr/share/pyshared/gi/types.py \
	./usr/lib/python2.6/dist-packages/gi/overrides/Pango.py \
	./usr/share/pyshared/gi/overrides/Gdk.py \
	./usr/lib/python2.6/dist-packages/gi/repository/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/_gobject/_gobject.so \
	./usr/lib/python2.7/dist-packages/gi/_glib/_glib.so \
	./usr/share/doc/python-gi/README \
	./usr/share/pyshared/gi/__init__.py \
	./usr/lib/libpyglib-gi-2.0-python2.7.so.0 \
	./usr/lib/python2.6/dist-packages/gi/overrides/Gtk.py \
	./usr/share/pyshared/gi/pygtkcompat.py \
	./usr/lib/python2.6/dist-packages/gi/_gobject/constants.py \
	./usr/lib/python2.7/dist-packages/gi/_gobject/_gobject.so \
	./usr/share/pyshared/gi/_gobject/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/overrides/Gio.py \
	./usr/share/doc/python-gi/copyright \
	./usr/share/pyshared/gi/overrides/keysyms.py \
	./usr/lib/python2.6/dist-packages/gi/_glib/_glib.so \
	./usr/lib/python2.7/dist-packages/gi/_gobject/constants.py \
	./usr/lib/python2.6/dist-packages/gi/_gobject/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/overrides/__init__.py \
	./usr/lib/pyshared/python2.6/gi/_gobject/_gobject.so \
	./usr/share/doc/python-gi/changelog.gz \
	./usr/lib/python2.7/dist-packages/gi/_gi.so \
	./usr/lib/python2.6/dist-packages/gi/overrides/GLib.py \
	./usr/lib/python2.7/dist-packages/gi/pygtkcompat.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/Pango.py \
	./usr/lib/python2.6/dist-packages/gi/__init__.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/Gio.py \
	./usr/lib/python2.6/dist-packages/gi/_gi.so \
	./usr/share/doc/python-gi/AUTHORS \
	./usr/share/pyshared/gi/overrides/GIMarshallingTests.py \
	./usr/share/pyshared/gi/module.py \
	./usr/lib/python2.7/dist-packages/gi/repository/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/module.py \
	./usr/lib/libpyglib-gi-2.0-python2.7.so \
	./usr/lib/python2.7/dist-packages/gi/_glib/option.py \
	./usr/lib/python2.7/dist-packages/gi/importer.py \
	./usr/share/pyshared/gi/overrides/GLib.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/_glib/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/importer.py \
	./usr/lib/python2.7/dist-packages/gi/_gobject/__init__.py \
	./usr/lib/python2.6/dist-packages/gi/pygtkcompat.py \
	./usr/lib/pyshared/python2.6/gi/_glib/_glib.so \
	./usr/lib/python2.6/dist-packages/gi/overrides/GIMarshallingTests.py \
	./usr/lib/python2.7/dist-packages/gi/_gobject/propertyhelper.py \
	./usr/share/doc/python-gi/changelog.Debian.gz \
	./usr/share/pyshared/gi/overrides/__init__.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/GLib.py \
	./usr/lib/python2.7/dist-packages/gi/overrides/GIMarshallingTests.py \
	./usr/lib/python2.7/dist-packages/gi/module.py\
"
FILES_python-gobject = " \
	./usr/share/doc/python-gobject/copyright \
	./usr/share/doc/python-gobject/changelog.gz \
	./usr/share/doc/python-gobject/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
