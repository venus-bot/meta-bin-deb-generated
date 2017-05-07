PACKAGES = "libgnutls-deb0-28"
PROVIDES = "libgnutls-deb0-28"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gnutls28/libgnutls-deb0-28_3.3.8-6+deb8u5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgnutls-deb0-28 = "libgnutls-deb0-28_3.3.8-6+deb8u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "f57199b67d46c2adefcde474b7181a9bf452b6f66d30d6f9dc2e6534f369ae41"
SRC_URI[deb0.md5sum] = "b378421ae34c608f3ba242172548bae2"

RDEPENDS_libgnutls-deb0-28 = "libc6 (>= 2.17) libgmp10 (>= 2:6) libhogweed2 (>= 2.7) libnettle4 (>= 2.7) libp11-kit0 (>= 0.20.7) libtasn1-6 (>= 4.1-0) zlib1g (>= 1:1.1.4)"
DEPENDS = "libnettle4 libgmp10 libp11-kit0 zlib1g libc6 libhogweed2 libtasn1-6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgnutls-deb0-28 = " \
	./usr/share/doc/libgnutls-deb0-28/changelog.Debian.gz \
	./usr/share/locale/ms/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/vi/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/doc/libgnutls-deb0-28/changelog.gz \
	./usr/share/locale/it/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/doc/libgnutls-deb0-28/README.gz \
	./usr/share/doc/libgnutls-deb0-28/THANKS.gz \
	./usr/share/doc/libgnutls-deb0-28/copyright \
	./usr/share/locale/uk/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/cs/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/fi/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/doc/libgnutls-deb0-28/AUTHORS \
	./usr/share/locale/nl/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28 \
	./usr/lib/arm-linux-gnueabihf/libgnutls-deb0.so.28.41.0 \
	./usr/share/locale/sv/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/en@boldquot/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/en@quot/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/pl/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/fr/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/doc/libgnutls-deb0-28/NEWS.Debian.gz \
	./usr/share/doc/libgnutls-deb0-28/NEWS.gz \
	./usr/share/locale/de/LC_MESSAGES/gnutls-deb0-28.mo \
	./usr/share/locale/eo/LC_MESSAGES/gnutls-deb0-28.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
