PACKAGES = "${PN} libdbus-glib-1-2"
PROVIDES = "libdbus-glib-1-2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-glib/libdbus-glib-1-2_0.102-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdbus-glib-1-2 = "libdbus-glib-1-2_0.102-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a46b11df865e0cd87be71592e02f040b1b332b3878440128b643fb4c383a997b"
SRC_URI[deb0.md5sum] = "e5e475f4f3999fd061dceec7e8d7ada9"

RDEPENDS_lib${PN}-1-2 = "libc6 (>= 2.4) libdbus-1-3 (>= 1.2.16) libglib2.0-0 (>= 2.31.8)"
DEPENDS = "libglib2.0-0 libc6 libdbus-1-3"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
