
Installation
============

- Install a fresh Ubuntu 12.10 server image
  (http://releases.ubuntu.com/quantal/ubuntu-12.10-server-amd64.iso)
  
- Jump to the section that describes either VirtualBox setup or Git setup.

- Run the setup script: `sudo /smogon/bin/smogon-setup`

- Reboot: `sudo reboot`
  (Yes, this step is necessary as the setup script modifies /etc/environment)
 

Installation (VirtualBox, w/ shared folders)
============================================

- (Optional): If you have trouble connecting to the Internet from the VBox
  guest, try `VBoxManage modifyvm <name of vm> --natdnshostresolver1 on` from
  the command line.

- Make sure you have the smogon-redux repo checked out locally. Then, go to
  Devices > Shared Folders and add the repo's directory. Make sure the folder
  name field is `smogon`.

- Setup port forwarding so we can access the SSH server and web server from
  outside the VM. Devices > Network Adapters, and map guest ports 22 and 80 host
  ports (I use 2222 and 2280 myself). Now you can ssh into the box
  using `ssh localhost -p 2222` and access the webserver via `localhost:2280`.

- Now, run the Smogon virtualbox bootstrap script:
  `sudo sh -c 'curl -L https://raw.github.com/monsanto/smogon-redux/master/bin/bootstrap-virtualbox | sh'`

  
Installation (Git)
==================

- Run the Smogon Git bootstrap script:
  `sudo sh -c 'curl -L https://raw.github.com/monsanto/smogon-redux/master/bin/bootstrap-git | sh'`

  
nREPL
=====

The server will run an nREPL on port 1234. Only connections from the machine
hosting the nREPL will be accepted. To access it, you will need to use SSH
tunneling. To setup a background SSH tunnel, use

  `ssh -Nf -L <local port>:<destination>:<remote-port> <gateway>`
  
For our local VirtualBox instance, the gateway is localhost on port 2222, and we
want to connect to localhost:1234.

  `ssh -Nf -L 21234:localhost:1234 localhost -p 2222`

To tunnel to the production server, try

  `ssh -Nf -L 31234:localhost:1234 smogon.com`

