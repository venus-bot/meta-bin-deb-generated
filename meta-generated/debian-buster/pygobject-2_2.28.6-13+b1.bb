PACKAGES = "${PN} python-gobject-2"
PROVIDES = "python-gobject-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pygobject-2/python-gobject-2_2.28.6-13+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_python-gobject-2 = "python-gobject-2_2.28.6-13+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1f414a735e8bf543ee887ae45259d71ef0c76da570ceb283efe69afd9dccc48e"
SRC_URI[deb0.md5sum] = "871de63c9d1b0528f525be6637b20e99"

RDEPENDS_python-gobject-2 = "libc6 (>= 2.4) libffi6 (>= 3.0.4) libglib2.0-0 (>= 2.41.1) python (<< 2.8) python (>= 2.6.6-7~) python (>= 2.7)"
DEPENDS = "libc6 libffi6 libglib2.0-0 python"


inherit deb_group

FILES_python-gobject-2 = " \
    ./usr/lib/libpyglib-2.0-python2.7.so.0 \
    ./usr/lib/libpyglib-2.0-python2.7.so.0.0.0 \
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
    ./usr/share/doc/python-gobject-2/changelog.Debian.armhf.gz \
    ./usr/share/doc/python-gobject-2/changelog.Debian.gz \
    ./usr/share/doc/python-gobject-2/changelog.gz \
    ./usr/share/doc/python-gobject-2/copyright \
    ./usr/share/doc/python-gobject-2/examples/cairo-demo.py \
    ./usr/share/doc/python-gobject-2/examples/option.py \
    ./usr/share/doc/python-gobject-2/examples/properties.py \
    ./usr/share/doc/python-gobject-2/examples/signal.py\
"
