PACKAGES = "${PN} gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
PROVIDES = "gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-freedesktop_1.42.0-2.2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-glib-2.0_1.42.0-2.2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/libgirepository-1.0-1_1.42.0-2.2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-freedesktop = "gir1.2-freedesktop_1.42.0-2.2_armhf.deb"
SRC_URI[deb0.sha256sum] = "9ea755212520facdcbbd9c7dce1d405214312d9b57df4cb4c2df445df929abad"
SRC_URI[deb0.md5sum] = "8caa741e45e91b83d9437eea9042d293"
DEBFILENAME_gir1.2-glib-2.0 = "gir1.2-glib-2.0_1.42.0-2.2_armhf.deb"
SRC_URI[deb1.sha256sum] = "76c59fb0e0187ca2bd13cbc6c8fe29176e1cf5cd1b37325d7eb0a5df713aead8"
SRC_URI[deb1.md5sum] = "e565ae6fa0b91687031f9bfa0f07c6e7"
DEBFILENAME_libgirepository-1.0-1 = "libgirepository-1.0-1_1.42.0-2.2_armhf.deb"
SRC_URI[deb2.sha256sum] = "8a1dcb1a7c6da6679ce8b36c1472567ac8b4d3c03be7bca7dde541e2d387e487"
SRC_URI[deb2.md5sum] = "a5aaf975a5c3a6dc3e5f0240a94f60f8"

RDEPENDS_gir1.2-freedesktop = "gir1.2-glib-2.0 (= 1.42.0-2.2) libcairo-gobject2 (>= 1.10.0) libgirepository-1.0-1 (>= 1.41.4-1)"
RDEPENDS_gir1.2-glib-2.0 = "libgirepository-1.0-1 (>= 1.41.4-1) libglib2.0-0 (>= 2.41.4)"
RDEPENDS_libgirepository-1.0-1 = "libc6 (>= 2.4) libffi6 (>= 3.0.4) libglib2.0-0 (>= 2.39.0)"
DEPENDS = "libc6 libglib2.0-0 libffi6 libcairo-gobject2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
    ./usr/share/doc/gir1.2-freedesktop/AUTHORS \
    ./usr/share/doc/gir1.2-freedesktop/CONTRIBUTORS \
    ./usr/share/doc/gir1.2-freedesktop/NEWS.gz \
    ./usr/share/doc/gir1.2-freedesktop/README \
    ./usr/share/doc/gir1.2-freedesktop/TODO \
    ./usr/share/doc/gir1.2-freedesktop/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-freedesktop/copyright\
"
FILES_gir1.2-glib-2.0 = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GIRepository-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GLib-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GModule-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GObject-2.0.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/Gio-2.0.typelib \
    ./usr/share/doc/gir1.2-glib-2.0/AUTHORS \
    ./usr/share/doc/gir1.2-glib-2.0/CONTRIBUTORS \
    ./usr/share/doc/gir1.2-glib-2.0/NEWS.gz \
    ./usr/share/doc/gir1.2-glib-2.0/README \
    ./usr/share/doc/gir1.2-glib-2.0/TODO \
    ./usr/share/doc/gir1.2-glib-2.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-glib-2.0/copyright\
"
FILES_libgirepository-1.0-1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgirepository-1.0.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgirepository-1.0.so.1.0.0 \
    ./usr/share/doc/libgirepository-1.0-1/AUTHORS \
    ./usr/share/doc/libgirepository-1.0-1/CONTRIBUTORS \
    ./usr/share/doc/libgirepository-1.0-1/NEWS.gz \
    ./usr/share/doc/libgirepository-1.0-1/README \
    ./usr/share/doc/libgirepository-1.0-1/TODO \
    ./usr/share/doc/libgirepository-1.0-1/changelog.Debian.gz \
    ./usr/share/doc/libgirepository-1.0-1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
