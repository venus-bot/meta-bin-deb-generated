PACKAGES = "${PN} gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
PROVIDES = "gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-freedesktop_1.58.3-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-glib-2.0_1.58.3-2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/libgirepository-1.0-1_1.58.3-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-freedesktop = "gir1.2-freedesktop_1.58.3-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "3fddd1906801182a72c98dc3b8239731f6d2b04873f803eea91523847ed1e444"
SRC_URI[deb0.md5sum] = "d0e338387e86a241d7ac64855686a363"
DEBFILENAME_gir1.2-glib-2.0 = "gir1.2-glib-2.0_1.58.3-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "9db56815153e9db7a235454a6a49bc5080227d285b13645cd0a7479e6531d599"
SRC_URI[deb1.md5sum] = "1dca38ed7f8377e611e2fb5f2061ea26"
DEBFILENAME_libgirepository-1.0-1 = "libgirepository-1.0-1_1.58.3-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "098e26c851ba98e524d1d1d653bdbf3b1a8b9db2e89bcb64002edd67c9598e26"
SRC_URI[deb2.md5sum] = "0765088b658def3fa487ddaebd024d66"

RDEPENDS_gir1.2-freedesktop = "gir1.2-glib-2.0 (= 1.58.3-2) libcairo-gobject2 (>= 1.10.0)"
RDEPENDS_gir1.2-glib-2.0 = "libgirepository-1.0-1 (>= 1.45.4) libglib2.0-0 (>= 2.58.2)"
RDEPENDS_libgirepository-1.0-1 = "libc6 (>= 2.4) libffi6 (>= 3.0.4) libglib2.0-0 (>= 2.58.0)"
DEPENDS = "libc6 libcairo-gobject2 libffi6 libglib2.0-0"


inherit deb_group

FILES_gir1.2-freedesktop = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/DBus-1.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/DBusGLib-1.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GL-1.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/cairo-1.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/fontconfig-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/freetype2-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/libxml2-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/xfixes-4.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/xft-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/xlib-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/xrandr-1.3.typelib \
    ./usr/share/doc/gir1.2-freedesktop/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-freedesktop/copyright\
"
FILES_gir1.2-glib-2.0 = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GIRepository-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GLib-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GModule-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GObject-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/Gio-2.0.typelib \
    ./usr/share/doc/gir1.2-glib-2.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-glib-2.0/copyright\
"
FILES_libgirepository-1.0-1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgirepository-1.0.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgirepository-1.0.so.1.0.0 \
    ./usr/share/doc/libgirepository-1.0-1/changelog.Debian.gz \
    ./usr/share/doc/libgirepository-1.0-1/copyright\
"
