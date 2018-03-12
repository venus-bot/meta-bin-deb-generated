PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lsb/lsb-base_4.1+Debian13+rpi1+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_4.1+Debian13+rpi1+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "164132410da6b2267df4fe34391e8ecd44349d29636317b09c65f3aa1b5aa111"
SRC_URI[deb0.md5sum] = "837f7b1f29c7f4ed354fd13d3b76fa2f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_lsb-base = " \
    ./lib/lsb/init-functions \
    ./lib/lsb/init-functions.d/20-left-info-blocks \
    ./usr/share/doc/lsb-base/NEWS.Debian.gz \
    ./usr/share/doc/lsb-base/README.Debian.gz \
    ./usr/share/doc/lsb-base/changelog.gz \
    ./usr/share/doc/lsb-base/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
