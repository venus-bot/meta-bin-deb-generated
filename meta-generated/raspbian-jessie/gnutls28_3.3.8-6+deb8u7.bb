PACKAGES = "${PN} libgnutls-deb0-28"
PROVIDES = "libgnutls-deb0-28"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gnutls28/libgnutls-deb0-28_3.3.8-6+deb8u7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgnutls-deb0-28 = "libgnutls-deb0-28_3.3.8-6+deb8u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "8d96893e05a1b0cea92c51b70dece4e111519436a1e67e643387c39851fc2dde"
SRC_URI[deb0.md5sum] = "cef4891db555ebb76c1a74989fc61e77"

RDEPENDS_libgnutls-deb0-28 = "libc6 (>= 2.17) libgmp10 (>= 2:6) libhogweed2 (>= 2.7) libnettle4 (>= 2.7) libp11-kit0 (>= 0.20.7) libtasn1-6 (>= 4.1-0) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libp11-kit0 libc6 libtasn1-6 libgmp10 libhogweed2 libnettle4"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgnutls-deb0-28 = " \
    ./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28 \
    ./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28.41.0 \
    ./usr/share/doc/libgnutls-deb0-28/AUTHORS \
    ./usr/share/doc/libgnutls-deb0-28/NEWS.Debian.gz \
    ./usr/share/doc/libgnutls-deb0-28/NEWS.gz \
    ./usr/share/doc/libgnutls-deb0-28/README.gz \
    ./usr/share/doc/libgnutls-deb0-28/THANKS.gz \
    ./usr/share/doc/libgnutls-deb0-28/changelog.Debian.gz \
    ./usr/share/doc/libgnutls-deb0-28/changelog.gz \
    ./usr/share/doc/libgnutls-deb0-28/copyright \
    ./usr/share/locale/cs/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/de/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/en@boldquot/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/en@quot/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/eo/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/fi/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/fr/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/it/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/ms/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/nl/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/pl/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/sv/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/uk/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/vi/LC_MESSAGES/gnutls-deb0-28.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/gnutls-deb0-28.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
