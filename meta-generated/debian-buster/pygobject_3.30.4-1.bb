PACKAGES = "${PN} python-gi python-gobject python3-gi"
PROVIDES = "python-gi python-gobject python3-gi"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/pygobject/python-gi_3.30.4-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/pygobject/python-gobject_3.30.4-1_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/p/pygobject/python3-gi_3.30.4-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_python-gi = "python-gi_3.30.4-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1c64d66fb9ce1122edf9fecb8a8c857ae276bf0a34e692816faffc7b1691b9f7"
SRC_URI[deb0.md5sum] = "cb271c4d76393fd046b798fcc450fc24"
DEBFILENAME_python-gobject = "python-gobject_3.30.4-1_all.deb"
SRC_URI[deb1.sha256sum] = "a5884545666d039f46f6a91fa47c4921ec1dd9f3c078688d7e5fa229724ccb15"
SRC_URI[deb1.md5sum] = "b506e4d30459bfe54fe316bbebfd30cd"
DEBFILENAME_python3-gi = "python3-gi_3.30.4-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "e8d1905727e087d779ddd69fe6f0df5c3da87d511974ca7b2a33087c29e4c5d6"
SRC_URI[deb2.md5sum] = "fd5b282bb16253cc11434f66ccee96e8"

RDEPENDS_python-gi = "gir1.2-glib-2.0 (>= 1.39.0) libc6 (>= 2.4) libffi6 (>= 3.0.4) libgirepository-1.0-1 (>= 1.44.0) libglib2.0-0 (>= 2.41.1) python (<< 2.8) python (<< 2.8) python (>= 2.7~) python (>= 2.7~)"
RDEPENDS_python-gobject = "python-gi (>= 3.30.4-1) python-gobject-2"
RDEPENDS_python3-gi = "gir1.2-glib-2.0 (>= 1.39.0) libc6 (>= 2.4) libffi6 (>= 3.0.4) libgirepository-1.0-1 (>= 1.44.0) libglib2.0-0 (>= 2.41.1) python3 python3 (<< 3.8) python3 (>= 3.6~)"
DEPENDS = "gir1.2-glib-2.0 libc6 libffi6 libgirepository-1.0-1 libglib2.0-0 python python-gobject-2 python3"


inherit deb_group

FILES_python-gi = " \
    ./usr/lib/python2.7/dist-packages/PyGObject-3.30.4.egg-info/PKG-INFO \
    ./usr/lib/python2.7/dist-packages/PyGObject-3.30.4.egg-info/dependency_links.txt \
    ./usr/lib/python2.7/dist-packages/PyGObject-3.30.4.egg-info/not-zip-safe \
    ./usr/lib/python2.7/dist-packages/PyGObject-3.30.4.egg-info/requires.txt \
    ./usr/lib/python2.7/dist-packages/PyGObject-3.30.4.egg-info/top_level.txt \
    ./usr/lib/python2.7/dist-packages/gi/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/_compat.py \
    ./usr/lib/python2.7/dist-packages/gi/_constants.py \
    ./usr/lib/python2.7/dist-packages/gi/_error.py \
    ./usr/lib/python2.7/dist-packages/gi/_gi.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/gi/_gtktemplate.py \
    ./usr/lib/python2.7/dist-packages/gi/_option.py \
    ./usr/lib/python2.7/dist-packages/gi/_ossighelper.py \
    ./usr/lib/python2.7/dist-packages/gi/_propertyhelper.py \
    ./usr/lib/python2.7/dist-packages/gi/_signalhelper.py \
    ./usr/lib/python2.7/dist-packages/gi/docstring.py \
    ./usr/lib/python2.7/dist-packages/gi/importer.py \
    ./usr/lib/python2.7/dist-packages/gi/module.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GIMarshallingTests.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GLib.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GObject.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gdk.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/GdkPixbuf.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gio.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Gtk.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/Pango.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/overrides/keysyms.py \
    ./usr/lib/python2.7/dist-packages/gi/pygtkcompat.py \
    ./usr/lib/python2.7/dist-packages/gi/repository/__init__.py \
    ./usr/lib/python2.7/dist-packages/gi/types.py \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/__init__.py \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/generictreemodel.py \
    ./usr/lib/python2.7/dist-packages/pygtkcompat/pygtkcompat.py \
    ./usr/share/doc/python-gi/NEWS.gz \
    ./usr/share/doc/python-gi/changelog.Debian.gz \
    ./usr/share/doc/python-gi/changelog.gz \
    ./usr/share/doc/python-gi/copyright\
"
FILES_python-gobject = " \
    ./usr/share/doc/python-gobject/changelog.Debian.gz \
    ./usr/share/doc/python-gobject/changelog.gz \
    ./usr/share/doc/python-gobject/copyright\
"
FILES_python3-gi = " \
    ./usr/lib/python3/dist-packages/PyGObject-3.30.4.egg-info/PKG-INFO \
    ./usr/lib/python3/dist-packages/PyGObject-3.30.4.egg-info/dependency_links.txt \
    ./usr/lib/python3/dist-packages/PyGObject-3.30.4.egg-info/not-zip-safe \
    ./usr/lib/python3/dist-packages/PyGObject-3.30.4.egg-info/requires.txt \
    ./usr/lib/python3/dist-packages/PyGObject-3.30.4.egg-info/top_level.txt \
    ./usr/lib/python3/dist-packages/gi/__init__.py \
    ./usr/lib/python3/dist-packages/gi/_compat.py \
    ./usr/lib/python3/dist-packages/gi/_constants.py \
    ./usr/lib/python3/dist-packages/gi/_error.py \
    ./usr/lib/python3/dist-packages/gi/_gi.cpython-36m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/gi/_gi.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/gi/_gtktemplate.py \
    ./usr/lib/python3/dist-packages/gi/_option.py \
    ./usr/lib/python3/dist-packages/gi/_ossighelper.py \
    ./usr/lib/python3/dist-packages/gi/_propertyhelper.py \
    ./usr/lib/python3/dist-packages/gi/_signalhelper.py \
    ./usr/lib/python3/dist-packages/gi/docstring.py \
    ./usr/lib/python3/dist-packages/gi/importer.py \
    ./usr/lib/python3/dist-packages/gi/module.py \
    ./usr/lib/python3/dist-packages/gi/overrides/GIMarshallingTests.py \
    ./usr/lib/python3/dist-packages/gi/overrides/GLib.py \
    ./usr/lib/python3/dist-packages/gi/overrides/GObject.py \
    ./usr/lib/python3/dist-packages/gi/overrides/Gdk.py \
    ./usr/lib/python3/dist-packages/gi/overrides/GdkPixbuf.py \
    ./usr/lib/python3/dist-packages/gi/overrides/Gio.py \
    ./usr/lib/python3/dist-packages/gi/overrides/Gtk.py \
    ./usr/lib/python3/dist-packages/gi/overrides/Pango.py \
    ./usr/lib/python3/dist-packages/gi/overrides/__init__.py \
    ./usr/lib/python3/dist-packages/gi/overrides/keysyms.py \
    ./usr/lib/python3/dist-packages/gi/pygtkcompat.py \
    ./usr/lib/python3/dist-packages/gi/repository/__init__.py \
    ./usr/lib/python3/dist-packages/gi/types.py \
    ./usr/lib/python3/dist-packages/pygtkcompat/__init__.py \
    ./usr/lib/python3/dist-packages/pygtkcompat/generictreemodel.py \
    ./usr/lib/python3/dist-packages/pygtkcompat/pygtkcompat.py \
    ./usr/share/doc/python3-gi/changelog.Debian.gz \
    ./usr/share/doc/python3-gi/changelog.gz \
    ./usr/share/doc/python3-gi/copyright\
"
