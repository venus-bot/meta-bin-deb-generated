PACKAGES = "${PN} libdbus-glib-1-2"
PROVIDES = "libdbus-glib-1-2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dbus-glib/libdbus-glib-1-2_0.102-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdbus-glib-1-2 = "libdbus-glib-1-2_0.102-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "de3661783f4c89bece93873823cd344b331dddff05d862421e066dcb530a36e5"
SRC_URI[deb0.md5sum] = "628aee8679adaddadf1a1b1bf1a0efd7"

RDEPENDS_lib${PN}-1-2 = "libc6 (>= 2.4) libdbus-1-3 (>= 1.2.16) libglib2.0-0 (>= 2.31.8) multiarch-support"
DEPENDS = "libc6 libdbus-1-3 libglib2.0-0 multiarch-support"


inherit deb_group

FILES_libdbus-glib-1-2 = " \
    ./usr/lib/arm-linux-gnueabihf/libdbus-glib-1.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libdbus-glib-1.so.2.2.2 \
    ./usr/share/doc/libdbus-glib-1-2/AUTHORS \
    ./usr/share/doc/libdbus-glib-1-2/NEWS.gz \
    ./usr/share/doc/libdbus-glib-1-2/README \
    ./usr/share/doc/libdbus-glib-1-2/changelog.Debian.gz \
    ./usr/share/doc/libdbus-glib-1-2/changelog.gz \
    ./usr/share/doc/libdbus-glib-1-2/copyright \
    ./usr/share/lintian/overrides/libdbus-glib-1-2\
"
