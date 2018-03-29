PACKAGES = "${PN} python-gi python-gobject"
PROVIDES = "python-gi python-gobject"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pygobject/python-gi_3.14.0-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/pygobject/python-gobject_3.14.0-1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-gi = "python-gi_3.14.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "660836c6402d5bf6fa370bde48e939effb432646cd0b65853e3914784ab97b6b"
SRC_URI[deb0.md5sum] = "a5a6c0e9bbe1fe4b682ac79cc6bbeb72"
DEBFILENAME_python-gobject = "python-gobject_3.14.0-1_all.deb"
SRC_URI[deb1.sha256sum] = "5e4872cd5248a0bf59b3377b8ccc1d07f8c682382214888c52aecc694010a63d"
SRC_URI[deb1.md5sum] = "e50d802841f709cdffcce07ccce6e23a"

RDEPENDS_python-gi = "python (>= 2.7) python (<< 2.8) libc6 (>= 2.4) libffi6 (>= 3.0.4) libgirepository-1.0-1 (>= 1.33.10) libglib2.0-0 (>= 2.41.1) gir1.2-glib-2.0 (>= 1.39.0)"
RDEPENDS_python-gobject = "python-gi (>= 3.14.0-1) python-gobject-2"
DEPENDS = "libffi6 libgirepository-1.0-1 libc6 python-gobject-2 python gir1.2-glib-2.0 libglib2.0-0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-gi = " \
    ./usr/lib/python2.7/dist-packages/gi/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/_constants.py \
    ./usr/lib/python2.7/dist-packages/gi/_error.py \
    ./usr/lib/python2.7/dist-packages/gi/_gi.so \
    ./usr/lib/python2.7/dist-packages/gi/_gobject/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/_option.py \
    ./usr/lib/python2.7/dist-packages/gi/_propertyhelper.py \
    ./usr/lib/python2.7/dist-packages/gi/_signalhelper.py \
    ./usr/lib/python2.7/dist-packages/gi/docstring.py \
    ./usr/lib/python2.7/dist-packages/gi/importer.py \
    ./usr/lib/python2.7/dist-packages/gi/module.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GIMarshallingTests.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GLib.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GObject.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gdk.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gio.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gtk.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Pango.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/keysyms.py \
    ./usr/lib/python2.7/dist-packages/gi/pygtkcompat.py \
    ./usr/lib/python2.7/dist-packages/gi/repository/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/types.py \
    ./usr/lib/python2.7/dist-packages/pygobject-3.14.0.egg-info \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/__init__.py \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/generictreemodel.py \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/pygtkcompat.py \
    ./usr/share/doc/python-gi/AUTHORS \
    ./usr/share/doc/python-gi/NEWS.gz \
    ./usr/share/doc/python-gi/README \
    ./usr/share/doc/python-gi/changelog.Debian.gz \
    ./usr/share/doc/python-gi/changelog.gz \
    ./usr/share/doc/python-gi/copyright \
    ./usr/share/lintian/overrides/python-gi\
"
FILES_python-gobject = " \
    ./usr/share/doc/python-gobject/changelog.Debian.gz \
    ./usr/share/doc/python-gobject/changelog.gz \
    ./usr/share/doc/python-gobject/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
