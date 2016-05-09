PACKAGES = "insserv"
PROVIDES = "insserv"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/i/insserv/insserv_1.14.0-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_insserv = "insserv_1.14.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "efb38bb74c358f579525608e174613fd9cf94ed98b0e420e89945a9c5500aeec"
SRC_URI[deb0.md5sum] = "b39989ce1f4c842a73a28b194813f6d0"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/insserv/make-testsuite \
	./usr/share/doc/insserv/changelog.gz \
	./usr/share/insserv/check-archive-initd-scripts \
	./etc/insserv.conf \
	./usr/share/insserv/seq-changes \
	./usr/share/doc/insserv/copyright \
	./usr/share/doc/insserv/README.Debian \
	./usr/share/doc/insserv/changelog.Debian.gz \
	./usr/share/doc/insserv/README \
	./sbin/insserv \
	./usr/share/insserv/check-initd-order \
	./usr/share/man/man8/insserv.8.gz \
	./etc/bash_completion.d/insserv\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
