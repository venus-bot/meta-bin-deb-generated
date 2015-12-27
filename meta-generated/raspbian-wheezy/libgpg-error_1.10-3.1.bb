PACKAGES = "libgpg-error0"
PROVIDES = "libgpg-error0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgpg-error/libgpg-error0_1.10-3.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgpg-error0 = "libgpg-error0_1.10-3.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "3f610f3988a1955353ac50926f47560eb23bb1c830cc752c2e31fac2f64464e5"
SRC_URI[deb0.md5sum] = "1a3ece8c95f5db59bcf6a54c11b3c959"

RDEPENDS_${PN}0 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgpg-error0 = " \
	./usr/share/locale/cs/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/ja/LC_MESSAGES/libgpg-error.mo \
	./lib/arm-linux-gnueabihf/libgpg-error.so.0 \
	./usr/share/doc/libgpg-error0/changelog.gz \
	./usr/share/doc/libgpg-error0/copyright \
	./usr/share/locale/pl/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/ro/LC_MESSAGES/libgpg-error.mo \
	./usr/share/doc/libgpg-error0/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libgpg-error.so.0.8.0 \
	./usr/share/locale/da/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/it/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/de/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/sv/LC_MESSAGES/libgpg-error.mo \
	./usr/share/doc/libgpg-error0/README \
	./usr/share/doc/libgpg-error0/NEWS.gz \
	./usr/share/locale/nl/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/fr/LC_MESSAGES/libgpg-error.mo \
	./usr/share/locale/vi/LC_MESSAGES/libgpg-error.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
