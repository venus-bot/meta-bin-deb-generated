PACKAGES = "${PN} libgpg-error0"
PROVIDES = "libgpg-error0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgpg-error/libgpg-error0_1.17-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgpg-error0 = "libgpg-error0_1.17-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "2006d65aeaf6656586cf6a4e2661dc09b44896bb4dd13733490fbf5fe0a6b478"
SRC_URI[deb0.md5sum] = "9a814b9f71beee29136bd8e176f06329"

RDEPENDS_${PN}0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgpg-error0 = " \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0 \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0.13.0 \
    ./usr/share/doc/libgpg-error0/README.gz \
    ./usr/share/doc/libgpg-error0/changelog.Debian.gz \
    ./usr/share/doc/libgpg-error0/changelog.gz \
    ./usr/share/doc/libgpg-error0/copyright \
    ./usr/share/locale/cs/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/da/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/de/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/eo/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/fr/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/it/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ja/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/nl/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/pl/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/pt/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ro/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ru/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/sr/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/sv/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/uk/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/vi/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/libgpg-error.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
