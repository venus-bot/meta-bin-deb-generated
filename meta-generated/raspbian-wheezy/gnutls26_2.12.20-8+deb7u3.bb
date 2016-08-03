PACKAGES = "libgnutls26"
PROVIDES = "libgnutls26"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gnutls26/libgnutls26_2.12.20-8+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgnutls26 = "libgnutls26_2.12.20-8+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "af3e5eccefa2f9c494e31a66fff01729a8c490c310cfd005000f85578596071a"
SRC_URI[deb0.md5sum] = "d5913ddeb3d04853f47aae5c8758449e"

RDEPENDS_lib${PN} = "libc6 (>= 2.13-28) libgcrypt11 (>= 1.4.5) libp11-kit0 (>= 0.11) libtasn1-3 (>= 1.6-0) zlib1g (>= 1:1.1.4)"
DEPENDS = "libp11-kit0 libtasn1-3 zlib1g libgcrypt11 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgnutls26 = " \
	./usr/share/doc/libgnutls26/AUTHORS.gz \
	./usr/share/locale/en@quot/LC_MESSAGES/libgnutls26.mo \
	./usr/share/locale/vi/LC_MESSAGES/libgnutls26.mo \
	./usr/share/doc/libgnutls26/README.gz \
	./usr/share/doc/libgnutls26/changelog.Debian.gz \
	./usr/share/locale/cs/LC_MESSAGES/libgnutls26.mo \
	./usr/share/doc/libgnutls26/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libgnutls.so.26 \
	./usr/share/locale/fr/LC_MESSAGES/libgnutls26.mo \
	./usr/share/locale/it/LC_MESSAGES/libgnutls26.mo \
	./usr/share/doc/libgnutls26/THANKS.gz \
	./usr/share/doc/libgnutls26/NEWS.Debian.gz \
	./usr/share/locale/de/LC_MESSAGES/libgnutls26.mo \
	./usr/lib/arm-linux-gnueabihf/libgnutls-extra.so.26 \
	./usr/share/locale/sv/LC_MESSAGES/libgnutls26.mo \
	./usr/share/locale/pl/LC_MESSAGES/libgnutls26.mo \
	./usr/share/locale/nl/LC_MESSAGES/libgnutls26.mo \
	./usr/share/doc/libgnutls26/NEWS.gz \
	./usr/share/locale/zh_CN/LC_MESSAGES/libgnutls26.mo \
	./usr/lib/arm-linux-gnueabihf/libgnutls.so.26.22.4 \
	./usr/share/locale/en@boldquot/LC_MESSAGES/libgnutls26.mo \
	./usr/lib/arm-linux-gnueabihf/libgnutls-extra.so.26.22.4 \
	./usr/share/locale/ms/LC_MESSAGES/libgnutls26.mo \
	./usr/share/doc/libgnutls26/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
