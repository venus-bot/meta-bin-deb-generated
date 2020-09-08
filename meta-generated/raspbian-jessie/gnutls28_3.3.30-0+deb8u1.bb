PACKAGES = "${PN} libgnutls-deb0-28"
PROVIDES = "libgnutls-deb0-28"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gnutls28/libgnutls-deb0-28_3.3.30-0+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgnutls-deb0-28 = "libgnutls-deb0-28_3.3.30-0+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6edde18f9710d844a3cdfee81575643dbd30f347cd142b33d88753a90af699e3"
SRC_URI[deb0.md5sum] = "30e9275757a6bcc470f0ac36b37b9683"

RDEPENDS_libgnutls-deb0-28 = "libc6 (>= 2.17) libgmp10 (>= 2:6) libhogweed2 (>= 2.7) libnettle4 (>= 2.7) libp11-kit0 (>= 0.20.7) libtasn1-6 (>= 4.1-0) multiarch-support zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libgmp10 libhogweed2 libnettle4 libp11-kit0 libtasn1-6 multiarch-support zlib1g"


inherit deb_group

FILES_libgnutls-deb0-28 = " \
    ./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28 \
    ./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28.43.4 \
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
