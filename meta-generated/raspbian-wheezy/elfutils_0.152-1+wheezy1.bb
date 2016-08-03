PACKAGES = "libelf1"
PROVIDES = "libelf1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/elfutils/libelf1_0.152-1+wheezy1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelf1 = "libelf1_0.152-1+wheezy1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7dbca513cc8487b4a28e05a337e9926058230376d3c224096a614a2208aaf95d"
SRC_URI[deb0.md5sum] = "8b8ed17bae326847de9d806501f8a102"

RDEPENDS_libelf1 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libelf1 = " \
	./usr/share/doc/libelf1/copyright \
	./usr/share/locale/es/LC_MESSAGES/elfutils.mo \
	./usr/share/doc/libelf1/changelog.Debian.gz \
	./usr/share/locale/en@boldquot/LC_MESSAGES/elfutils.mo \
	./usr/lib/libelf.so.1 \
	./usr/lib/libelf-0.152.so \
	./usr/share/locale/en@quot/LC_MESSAGES/elfutils.mo \
	./usr/share/doc/libelf1/changelog.gz \
	./usr/share/locale/de/LC_MESSAGES/elfutils.mo \
	./usr/share/locale/pl/LC_MESSAGES/elfutils.mo \
	./usr/share/locale/uk/LC_MESSAGES/elfutils.mo \
	./usr/share/locale/ja/LC_MESSAGES/elfutils.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
