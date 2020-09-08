PACKAGES = "${PN} libgnutls30"
PROVIDES = "libgnutls30"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gnutls28/libgnutls30_3.6.7-4+deb10u5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgnutls30 = "libgnutls30_3.6.7-4+deb10u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "dfd3e885cc7090d951d3e00fa9ef6f2f2b462dd152bfc43c456c077cc3ea9351"
SRC_URI[deb0.md5sum] = "b7d05c3214dd4803f1a2edc9daeb2634"

RDEPENDS_libgnutls30 = "libc6 (>= 2.28) libgmp10 (>= 2:6.0.0) libhogweed4 (>= 3.4.1~rc1~) libidn2-0 (>= 2.0.0) libnettle6 (>= 3.4~) libp11-kit0 (>= 0.23.11) libtasn1-6 (>= 4.12) libunistring2 (>= 0.9.7)"
DEPENDS = "libc6 libgmp10 libhogweed4 libidn2-0 libnettle6 libp11-kit0 libtasn1-6 libunistring2"


inherit deb_group

FILES_libgnutls30 = " \
    ./usr/lib/arm-linux-gnueabihf/libgnutls.so.30 \
    ./usr/lib/arm-linux-gnueabihf/libgnutls.so.30.23.2 \
    ./usr/share/doc/libgnutls30/AUTHORS.gz \
    ./usr/share/doc/libgnutls30/NEWS.Debian.gz \
    ./usr/share/doc/libgnutls30/NEWS.gz \
    ./usr/share/doc/libgnutls30/README.md.gz \
    ./usr/share/doc/libgnutls30/THANKS.gz \
    ./usr/share/doc/libgnutls30/changelog.Debian.gz \
    ./usr/share/doc/libgnutls30/changelog.gz \
    ./usr/share/doc/libgnutls30/copyright \
    ./usr/share/doc/libgnutls30/license.AGPLv3.gz \
    ./usr/share/locale/cs/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/de/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/eo/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/es/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/fi/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/fr/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/it/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/ms/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/nl/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/pl/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/sr/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/sv/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/uk/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/vi/LC_MESSAGES/gnutls30.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/gnutls30.mo\
"
